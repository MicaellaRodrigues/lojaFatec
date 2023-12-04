import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BuscaComponent } from './busca/busca.component';
import { LoginComponent } from './login/login.component';
import { VitrineComponent } from './vitrine/vitrine.component';
import { CamisetaComponent } from './camiseta/camiseta.component';
import { CamisetaPretaComponent } from './camiseta-preta/camiseta-preta.component';
import { SambacComponent } from './sambac/sambac.component';
import { CanecaComponent } from './caneca/caneca.component';
import { CestaComponent } from './cesta/cesta.component';
import { EsqueciSenhaComponent } from './esqueci-senha/esqueci-senha.component';
import { InicioComponent } from './inicio/inicio.component';
import { PaginaCadastroComponent } from './pagina-cadastro/pagina-cadastro.component';

const routes: Routes = [
{ path: 'busca' , component: BuscaComponent},
{ path: 'login' , component: LoginComponent}, 
{ path: 'vitrine' , component: VitrineComponent},
{ path: 'camiseta' , component: CamisetaComponent},
{ path: 'camiseta_preta' , component: CamisetaPretaComponent},
{ path: 'caneca' , component: CanecaComponent},
{ path: 'sambac' , component: SambacComponent},
{ path: 'pagina_cadastro', component: PaginaCadastroComponent},
{path: 'esqueci_senha', component: EsqueciSenhaComponent},
{ path: 'inicio', component: InicioComponent},
{ path: 'cesta' , component: CestaComponent},
{ path: '', redirectTo: 'vitrine', pathMatch: 'full'},
{ path: '**', redirectTo: 'vitrine'}
];

@NgModule({

  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
