package QuizWiz.Security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import QuizWiz.service.ServiceProvider.UserDetailServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import io.jsonwebtoken.ExpiredJwtException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

	@Autowired
	private UserDetailServiceProvider userDetailServiceProvider;

	@Autowired
	private JwtUtility jwtUtility;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		final String requestTokenHeader = request.getHeader("Authorization");

		System.out.println(requestTokenHeader+"sabbir");

		String username = null;
		String jwtToken = null;

		if (requestTokenHeader != null && requestTokenHeader.startsWith("Bearer ")) {
			// yes

			jwtToken = requestTokenHeader.substring(7);

			try {

				username = this.jwtUtility.extractUsername(jwtToken);

			} catch (ExpiredJwtException e) {
				e.printStackTrace();
				System.out.println("Jwt Token get expired !!");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("error");
			}

		} else {
			System.out.println("Invalid Token, not start with bearer String !!");
		}

		// validated

		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			final UserDetails userDetails = this.userDetailServiceProvider.loadUserByUsername(username);

			if (this.jwtUtility.validateToken(jwtToken, userDetails)) {
				// token is valid

				UsernamePasswordAuthenticationToken usernamePasswordAuthentication = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());
				usernamePasswordAuthentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthentication);
			}
		}else {
			System.out.println("Token is not valid");
		}
		
		filterChain.doFilter(request, response);

	}

}
