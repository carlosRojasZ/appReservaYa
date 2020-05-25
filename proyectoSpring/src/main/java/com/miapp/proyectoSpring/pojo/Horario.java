package com.miapp.proyectoSpring.pojo;

public class Horario {

	//---
		public int tipo; // 1 = jornada completa, 2 = jornada tarde, 3 = joranada mañana
		public String aperturaM;
		public String aperturaT;
		public String cierreM;
		public String cierreT;
		 

		public int getTipo() {
			establecerTipoHorario();
			return tipo;
		}

		public void establecerTipoHorario() {
			if(this.aperturaM != null && this.cierreT != null ) {
				this.tipo = 1;
			}
			if(this.aperturaT != null && this.aperturaM == null 
				&& this.cierreM == null && this.cierreT != null) {
				this.tipo = 2;
			}
			if(this.aperturaM != null && this.aperturaT == null
					&& this.cierreM != null && this.cierreT == null) {
				this.tipo =3;
			}
		}
		public void setTipo(int tipo) {
			
			this.tipo = tipo;
		}

		public String getAperturaM() {
			return aperturaM;
		}

		public void setAperturaM(String aperturaM) {
			this.aperturaM = aperturaM;
		}

		public String getAperturaT() {
			return aperturaT;
		}

		public void setAperturaT(String aperturaT) {
			this.aperturaT = aperturaT;
		}

		public String getCierreM() {
			return cierreM;
		}

		public void setCierreM(String cierreM) {
			this.cierreM = cierreM;
		}

		public String getCierreT() {
			return cierreT;
		}

		public void setCierreT(String cierreT) {
			this.cierreT = cierreT;
		}
		
}
