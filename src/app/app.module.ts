import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BuscaComponent } from './busca/busca.component';
import { CamisetaComponent } from './camiseta/camiseta.component';
import { CamisetaPretaComponent } from './camiseta-preta/camiseta-preta.component';
import { CanecaComponent } from './caneca/caneca.component';
import { CestaComponent } from './cesta/cesta.component';
import { EsqueciSenhaComponent } from './esqueci-senha/esqueci-senha.component';
import { InicioComponent } from './inicio/inicio.component';
import { LoginComponent } from './login/login.component';
import { PaginaCadastroComponent } from './pagina-cadastro/pagina-cadastro.component';
import { SambacComponent } from './sambac/sambac.component';
import { VitrineComponent } from './vitrine/vitrine.component';

@NgModule({
  declarations: [
    AppComponent,
    BuscaComponent,
    CamisetaComponent,
    CamisetaPretaComponent,
    CanecaComponent,
    CestaComponent,
    EsqueciSenhaComponent,
    InicioComponent,
    LoginComponent,
    PaginaCadastroComponent,
    SambacComponent,
    VitrineComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
