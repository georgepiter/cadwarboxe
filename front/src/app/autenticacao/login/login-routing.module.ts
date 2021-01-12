import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/Router';

import { LoginComponent, LogarComponent } from './components';

export const LoginRoutes: Routes = [
    {
        path: 'login',
        component: LogarComponent,
        children: [{ path: '', component: LoginComponent }]
    }
];

@NgModule({
    imports: [RouterModule.forChild(LoginRoutes)],
    exports: [RouterModule]
})
export class LoginRoutingModule {
}
