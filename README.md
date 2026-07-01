# 🎓 Desafio POO DIO - Abstração de um Bootcamp em Java

Este projeto foi desenvolvido como um desafio prático da DIO com o objetivo de modelar o ecossistema de um **Bootcamp** utilizando a Programação Orientada a Objetos (POO). Ele representa um cenário real onde desenvolvedores se inscrevem em programas de treinamento, progridem através de conteúdos (Cursos e Mentorias) e acumulam XP.

## 🚀 O que estou praticando?

Neste desafio, apliquei conceitos estruturais e arquiteturais de POO indispensáveis para o mercado:

* **Abstração e Herança:** Criação da classe abstrata `Conteudo`, que serve como base comum para as classes `Curso` e `Mentoria`, garantindo que ambas implementem a lógica de cálculo de XP de formas personalizadas.
* **Polimorfismo:** Uso do método abstrato `calcularXp()`, onde cada tipo de conteúdo atribui uma pontuação diferente (Cursos multiplicam a carga horária, enquanto Mentorias somam um bônus fixo).
* **Encapsulamento Total:** Atributos estritamente protegidos com acessores (`getters` e `setters`) e forte proteção de estado interno nas regras de progressão.
* **Coleções Avançadas (`Set` e `LinkedHashSet`):** Uso estratégico de coleções do tipo `Set` para gerenciar os conteúdos inscritos e concluídos dos desenvolvedores, impedindo duplicidade de cursos e mantendo a ordem de inscrição através do `LinkedHashSet`.

## 🎨 Arquitetura do Sistema

O domínio do projeto foi mapeado com as seguintes entidades:

* **Conteudo (Classe Mãe Abstrata):** Define a base de contratos para qualquer material de estudo do Bootcamp.
* **Curso:** Tipo de conteúdo que possui `cargaHoraria`.
* **Mentoria:** Tipo de conteúdo que possui uma `data` específica para acontecer.
* **Bootcamp:** Agrupa uma coleção de conteúdos, uma lista de desenvolvedores inscritos e define as datas de início e término do programa.
* **Dev:** Representa o aluno. Possui métodos essenciais de negócio como `inscreverBootcamp()`, `progredir()` (que move o curso atual da lista de "inscritos" para "concluídos") e `calcularTotalXp()`.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 15).
* **IDE:** IntelliJ IDEA.
* **Estrutura de Dados:** Java Collections API (`Set`, `LinkedHashSet`, `Optional`).

## 📝 Exemplo de Execução

No arquivo `Main.java`, a estrutura é validada simulando a criação de dois desenvolvedores. O código inscreve ambos no mesmo Bootcamp, faz um deles progredir mais rápido e exibe no console o status de cada um, detalhando os cursos restantes e a pontuação total de XP acumulada de forma dinâmica.

---

*Este projeto demonstra a minha habilidade em projetar arquiteturas de software sólidas, reaproveitáveis e alinhadas com as melhores práticas de POO em Java.*
