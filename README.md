🛠️ Sistema de Gestão de Ordens de Serviço (Oficina)

Um sistema backend desenvolvido em Java para resolver um problema real de pequenas oficinas e assistências técnicas: a perda de controle sobre chamados, orçamentos e prazos de entrega.

🚧 Roadmap e Evolução do Projeto:
Este repositório representa a Fase 1 (Fundamentos). O projeto foi intencionalmente construído utilizando apenas Java Puro (Arrays e POO), sem o uso de Collections (como List ou ArrayList), para consolidar conceitos essenciais de gerenciamento de memória, encapsulamento e regras de negócio.

A Fase 2 já está em desenvolvimento! O sistema será migrado para uma arquitetura moderna utilizando Spring Boot, criação de REST APIs, JPA/Hibernate e banco de dados relacional.

✨ Funcionalidades (Fase 1 - CLI)

Cadastro Seguro de Ordens: Criação de OS com validação de dados em tempo real.

Blindagem Financeira: O sistema impede o cadastro de orçamentos com valores negativos.

Validação Temporal: Utilização da API java.time para garantir que a data de previsão de entrega nunca seja anterior à data de abertura.

Máquina de Estados de Status: Travas lógicas que impedem que uma ordem CONCLUIDA retorne para status anteriores acidentalmente.

Gerenciamento em Memória: Armazenamento contínuo da sessão rodando diretamente em Arrays nativos do Java.

🚀 Tecnologias Utilizadas

Java (JDK)

Programação Orientada a Objetos (POO): Classes de Domínio, Enums para padronização e Separação de Responsabilidades (Service vs Model).

Scanner & CLI: Interface interativa e amigável via terminal.

⚙️ Como executar

Clone este repositório:

git clone https://github.com/seu-usuario/nome-do-repositorio.git


Abra o projeto na sua IDE de preferência (VS Code, IntelliJ, Eclipse).

Navegue até o pacote main e execute o arquivo MainTest.java.

Siga as instruções no terminal para interagir com o menu.

💡 Aprendizados

Construir este projeto na base do Java me permitiu entender profundamente como regras de negócio devem proteger o sistema antes mesmo de pensarmos em banco de dados, além de dominar a lógica de iteração (loops) e manipulação de vetores na unha.