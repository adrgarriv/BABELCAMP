/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { VjComponent } from './vj.component';

describe('VjComponent', () => {
  let component: VjComponent;
  let fixture: ComponentFixture<VjComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VjComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VjComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
