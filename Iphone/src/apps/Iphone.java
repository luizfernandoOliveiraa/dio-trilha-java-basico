package apps;

public class Iphone implements Musica, Phone, Safari{
		
	private String url;
	private String numero;
	private String musica;
	
		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
		
		public void exibirPagina(String site) {
			setUrl(site);
			System.out.println("Abrindo site no endereço " + getUrl());
		}
		
		public void adicionarAba(String novoSite) {
			setUrl(novoSite);
			System.out.println("Abrindo a nova aba no endereço " + getUrl());
		}
		
		public void atualizarPagina() {
			System.out.println("Atualizando pagina principal");
		}
		
		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}
		
		public void ligar(String numero) {
			setNumero(numero);
			System.out.println("Ligando para o núemro " + getNumero());
		}
		
		public void atender() {
			System.out.println("Recebendo chamada");
			System.out.println("Chamada atendida");
		}
		
		public void correioVoz() {
			System.out.println("Conectando a correio de voz");
			System.out.println("Escutando mensagens");
		}

	    // Getter: retorna o nome da música
	    public String getMusica() {
	        return musica;
	    }

	    // Setter: define o nome da música
	    public void setMusica(String musica) {
	        this.musica = musica;
	    }
	    
	    // Método para selecionar a música e mostrar uma mensagem
	    public void selecionarMusica(String nomeDaMusica) {
	        setMusica(nomeDaMusica);
	    }
	    
		private void conectadoInternet() {
			System.out.println("Conexão estabelecida com Wifi / 4G");
		}
		
		public void tocar() {
			conectadoInternet();
			selecionarMusica(musica);
			System.out.println("Musica selecionada: " + getMusica());
			System.out.println("Tocando música selecionada");
		}
		
		public void pausar() {
			System.out.println("Pausando musica");
		}
		public void inicio() {
	        System.out.println("Selecione uma opção do nosso menu:");
	        System.out.println("1- iPod (Músicas e Mídias)");
	        System.out.println("2- Phone (Chamadas e Agenda)");
	        System.out.println("3- Safari (Internet)");
	        System.out.println("0- Sair");
	    }

	
}
