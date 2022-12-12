public static void main(String[] args) {
	ArquivoControlado arq1 = new ArquivoControlado("principal.java","// Arquivo Princiapal\nAutor: Aluno1");
	ArquivoControlado arq2 = new ArquivoControlado("biblioteca.java", "// Biblioteca Utilizada\nAutor: Aluno1");
	Diretorio pastaProjeto = new Diretorio();
	pastaProjeto.adicionaArquivo(arq1);
	pastaProjeto.adicionaArquivo(arq2);
	ControlZ versionadorProjeto = new ControlZ(pastaProjeto);
	versionadorProjeto.estado();
	versionadorProjeto.confirma();
	versionadorProjeto.estado();
	arq1.adicionaConteudo("System.out.println(\"Ola Mundo!\")");
	versionadorProjeto.estado();
	versionadorProjeto.confirma();
	versionadorProjeto.estado();
	arq1.adicionaConteudo("// Biblioteca Utilizada\nAutor: Desenvolvedor1");
	versionadorProjeto.estado();
	versionadorProjeto.confirma();
	versionadorProjeto.estado();
	versionadorProjeto.retrocede();
	versionadorProjeto.estado();
	versionadorProjeto.retrocede();
	versionadorProjeto.estado();
	arq1.adicionaConteudo("// Biblioteca Utilizada\nAutor: Desenvolvedor2");
	versionadorProjeto.confirma();
	versionadorProjeto.estado();
	ArquivoControlado arq3 = new ArquivoControlado("biblioteca2.java","// Nova Biblioteca Utilizafa\nAutor: Desenvolvedor2");
	pastaProjeto.adicionaArquivo(arq3);
	versionadorProjeto.estado();
	versionadorProjeto.confirma();
	versionadorProjeto.estado();
	
}
