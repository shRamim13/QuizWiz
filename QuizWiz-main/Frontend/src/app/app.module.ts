import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button';
import { NavbarComponent } from './components/navbar/navbar.component';
import { SignupComponent } from './pages/signup/signup.component';
import { LoginComponent } from './pages/login/login.component';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import Swal from 'sweetalert2';
import { HomeComponent } from './pages/home/home.component';
import {MatCardModule} from '@angular/material/card';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import { authInterceptorProviders } from './services/auth.interceptor';
import { DashboardComponent } from './pages/admin/dashboard/dashboard.component';
import { UserDashboardComponent } from './pages/user/user-dashboard/user-dashboard.component';
import { ProfileComponent } from './pages/profile/profile.component';
import {MatListModule} from '@angular/material/list';
import { SidebarComponent } from './pages/admin/sidebar/sidebar.component';
import { SidebarComponent as UserSidebar} from './pages/user/sidebar/sidebar.component';
import { WelcomeComponent } from './pages/admin/welcome/welcome.component';
import { ViewCategoriesComponent } from './pages/admin/view-categories/view-categories.component';
import { AddCategoryComponent } from './pages/admin/add-category/add-category.component';
import { ViewQuizzesComponent } from './pages/admin/view-quizzes/view-quizzes.component';
import { AddQuizComponent } from './pages/admin/add-quiz/add-quiz.component';
import { UpdateQuizComponent } from './pages/admin/update-quiz/update-quiz.component';
import { ViewQuizQuestionsComponent } from './pages/admin/view-quiz-questions/view-quiz-questions.component';
import { AddQuestionComponent } from './pages/admin/add-question/add-question.component';
import {MatSlideToggleModule} from '@angular/material/slide-toggle';
import {MatSelectModule} from '@angular/material/select';
import { CKEditorModule } from '@ckeditor/ckeditor5-angular';
import { InstructionsComponent } from './pages/user/instructions/instructions.component';
import { LoadQuizComponent } from './pages/user/load-quiz/load-quiz.component';
import { StartComponent } from './pages/user/start/start.component';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { CandidateDashboardComponent } from './pages/canidate/candidate-dashboard/candidate-dashboard.component';
import { ExamStartComponent } from './pages/canidate/exam-start/exam-start.component';
import { ExamInstructionsComponent } from './pages/canidate/exam-instructions/exam-instructions.component';
import { ViewExamsComponent } from './pages/admin/view-exams/view-exams.component';
import { AddExamComponent } from './pages/admin/add-exam/add-exam.component';
import { UpdateExamComponent } from './pages/admin/update-exam/update-exam.component';
import { ViewExamQuestionsComponent } from './pages/admin/view-exam-questions/view-exam-questions.component';
import { ViewCandidateComponent } from './pages/admin/view-candidate/view-candidate.component';
import { AddCandidateComponent } from './pages/admin/add-candidate/add-candidate.component';
import { AddExamQuestionComponent } from './pages/admin/add-exam-question/add-exam-question.component';
import {MatTableModule} from '@angular/material/table';
import {NgxMaterialTimepickerModule} from 'ngx-material-timepicker';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import { UpdateCandidateComponent } from './pages/admin/update-candidate/update-candidate.component';
import { ResultComponent } from './pages/admin/result/result.component';
import { UpdateAdminComponent } from './pages/admin/update-admin/update-admin.component';
import { UpdatePasswordComponent } from './pages/admin/update-password/update-password.component';
import { QuestionUpdateComponent } from './pages/admin/question-update/question-update.component';
import { ToastrModule } from 'ngx-toastr';
import { NgxSpinnerModule } from "ngx-spinner";


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SignupComponent,
    LoginComponent,
    HomeComponent,
    DashboardComponent,
    UserDashboardComponent,
    ProfileComponent,
    SidebarComponent,
    WelcomeComponent,
    ViewCategoriesComponent,
    AddCategoryComponent,
    ViewQuizzesComponent,
    AddQuizComponent,
    UpdateQuizComponent,
    ViewQuizQuestionsComponent,
    AddQuestionComponent,
    UserSidebar,
    InstructionsComponent,
    LoadQuizComponent,
    StartComponent,
    CandidateDashboardComponent,
    ExamStartComponent,
    ExamInstructionsComponent,
    ViewExamsComponent,
    AddExamComponent,
    UpdateExamComponent,
    ViewExamQuestionsComponent,
    ViewCandidateComponent,
    AddCandidateComponent,
    AddExamQuestionComponent,
    UpdateCandidateComponent,
    ResultComponent,
    UpdateAdminComponent,
    UpdatePasswordComponent,
    QuestionUpdateComponent,

  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatInputModule,
    MatFormFieldModule,
    FormsModule,
    HttpClientModule,
    MatSnackBarModule,
    MatCardModule,
    MatToolbarModule,
    MatIconModule,
    MatListModule,
    MatSlideToggleModule,
    MatSelectModule,
    CKEditorModule,
    MatProgressSpinnerModule,
    MatTableModule,
    MatDatepickerModule,
    NgxMaterialTimepickerModule,
    MatNativeDateModule,
    ToastrModule,
    NgxSpinnerModule
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
