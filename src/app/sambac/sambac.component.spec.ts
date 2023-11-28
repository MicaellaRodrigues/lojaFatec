import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SambacComponent } from './sambac.component';

describe('SambacComponent', () => {
  let component: SambacComponent;
  let fixture: ComponentFixture<SambacComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SambacComponent]
    });
    fixture = TestBed.createComponent(SambacComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
