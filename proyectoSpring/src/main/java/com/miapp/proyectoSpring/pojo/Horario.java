package com.miapp.proyectoSpring.pojo;

public class Horario {

	//---
		public int tipo; // 1 = jornada completa, 2 = jornada tarde, 3 = joranada mañana
		public String aperturaM;
		public String aperturaT;
		public String cierreM;
		public String cierreT;
		
		public void getHorario() {
			switch(tipo) {
			case 1:
			break;
			case 2:
			break;
			case 3:
			break;
			}
		}

		public int getTipo() {
			return tipo;
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
