import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CadastroServiceService } from '../services/cadastro-service.service';
import { lastValueFrom } from 'rxjs';

@Component({
  selector: 'app-pagina-cadastro',
  templateUrl: './pagina-cadastro.component.html',
  styleUrls: ['./pagina-cadastro.component.css']
})
export class PaginaCadastroComponent {

  cadastroForm: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private cadastroService: CadastroServiceService
  ) {
    this.cadastroForm = this.formBuilder.group({
      nome: ['', Validators.required],
      sobrenome: ['', Validators.required],
      dataNascimento: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      senha: ['', [Validators.required, Validators.minLength(6)]],
      cpf: ['', Validators.required],
      celular: ['', Validators.required],
      rua: ['', Validators.required],
      cep: ['', Validators.required],
      bairro: ['', Validators.required],
      cidade: ['', Validators.required],
      estado: ['', Validators.required],
      aceitoTermos: [false, Validators.requiredTrue]
    });
  }

  async onSubmit() {
    try {
      if (this.cadastroForm.valid) {
        const cadastroData = this.cadastroForm.value;
        const response = await lastValueFrom(this.cadastroService.save(cadastroData));
        console.log('Cadastro realizado com sucesso!', response);
        // Lógica adicional após o cadastro bem-sucedido, se necessário
      } else {
        console.log('Formulário inválido. Verifique os campos.');
      }
    } catch (error) {
      console.error('Erro ao cadastrar:', error);
      // Lógica adicional para lidar com erros, se necessário
    }
  }
  
}
