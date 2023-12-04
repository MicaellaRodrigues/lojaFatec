import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CadastroServiceService } from '../services/cadastro-service.service';
import { lastValueFrom } from 'rxjs';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';


@Component({
  selector: 'app-pagina-cadastro',
  templateUrl: './pagina-cadastro.component.html',
  styleUrls: ['./pagina-cadastro.component.css']
})
export class PaginaCadastroComponent {

  cadastroForm: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private mSnack: MatSnackBar,
    private cadastroService: CadastroServiceService,
    private router: Router
  ) {
    this.cadastroForm = this.formBuilder.group({
      nome: ['', Validators.required],
      sobrenome: ['', Validators.required],
      dataNascimento: ['', Validators.required],
      email: ['', [Validators.required,]],
      senha: ['', [Validators.required,]],
      cpf: ['', Validators.required],
      celular: ['', Validators.required],
      rua: ['', Validators.required],
      cep: ['', Validators.required],
      bairro: ['', Validators.required],
      cidade: ['', Validators.required],
      estado: ['', Validators.required,],
      aceitoTermos: [false, Validators.requiredTrue]
    });
  }

  async onSubmit() {
    try {
      if (this.cadastroForm.valid) {
        const cadastroData = this.cadastroForm.value;
        const response = await lastValueFrom(this.cadastroService.save(cadastroData));
        this.alert('Cadastro realizado com sucesso!', response);
        setTimeout(() => {
          location.reload();
        }, 500);
        // this.router.navigate(['pagina_cadastro']);


      } else {
        this.alert('Formulário inválido. Verifique os campos.');
      }
    } catch (error) {
      this.alert('Erro ao cadastrar');

    }
  }

  alert(message: string, response?: any) {
    this.mSnack.open(message, 'X', {
      duration: 2000,
      horizontalPosition: 'end',
      verticalPosition: 'top',
    });
  }


}
