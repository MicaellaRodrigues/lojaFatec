import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CamisetaPretaComponent } from './camiseta-preta.component';

describe('CamisetaPretaComponent', () => {
  let component: CamisetaPretaComponent;
  let fixture: ComponentFixture<CamisetaPretaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CamisetaPretaComponent]
    });
    fixture = TestBed.createComponent(CamisetaPretaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
