import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { first } from 'rxjs';
import { Cadastro } from '../interfaces/cadastro';



@Injectable({
  providedIn: 'root'
})
export class CadastroServiceService {
  private readonly API = 'api/cliente';

  constructor(private httpClient: HttpClient) { }

  list(page = 0, pageSize = 10) {
    return this.httpClient.get<Cadastro>(this.API, { params: { page, pageSize } })
      .pipe(
        first(),
      );
  }

  loadById(id: string) {
    return this.httpClient.get<Cadastro>(`${this.API}/${id}`);
  }

  save(record: Partial<Cadastro>) {

    // if (record.id) {
    //   return this.update(record);
    // }

    return this.create(record);
  }

  private create(record: Partial<Cadastro>) {
    return this.httpClient.post<Cadastro>(this.API, record).pipe(first());
  }

  // private update(record: Partial<Cadastro>) {
  //   return this.httpClient.put<Cadastro>(`${this.API}/${record.id}`, record).pipe(first());
  // }



}
