package br.com.falcao.rh.shared.domain.enums;

public enum Cargo {
	ASSISTENTE {
		@Override
		public Cargo getProximoCargo() {
			return ANALISTA;
		}
	},
	ANALISTA {
		@Override
		public Cargo getProximoCargo() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		@Override
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	},
	GERENTE {
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	};

	public abstract Cargo getProximoCargo();
}
