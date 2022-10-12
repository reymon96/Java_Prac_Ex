public class Cuenta {

	private String _strNombre;
	private double _dblSaldo;

	public Cuenta(String strNombre, double dblSaldo){
		
		this._strNombre = strNombre;

		if (dblSaldo > 0.0) {
			this._dblSaldo = dblSaldo;
		}

	}

	public void Deposito(double dblMontoDeposito){
		if (dblMontoDeposito > 0.0) {
			_dblSaldo = _dblSaldo  + dblMontoDeposito;
		}
	}

	public double ObtenerSaldo(){
		return _dblSaldo;
	}

	public void EstablecerNombre(String strNombre){
		this._strNombre = strNombre;
	}

	public String ObtenerNombre(){
		return _strNombre;
	}

}