import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CanecaComponent } from './caneca.component';

describe('CanecaComponent', () => {
  let component: CanecaComponent;
  let fixture: ComponentFixture<CanecaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CanecaComponent]
    });
    fixture = TestBed.createComponent(CanecaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
