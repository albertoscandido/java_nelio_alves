# Extra - comandos básicos git e github

Nessa parte do curso, anotei apenas pontos interessantes pra mim pois eu já trabalho com git e github no dia a dia e tinha conhecimento sobre a maior parte do conteúdo apresentado.


## Desfasendo modificações não salvas

```bash
    git reset #remove arquivos da área stage do git 
    git clean -df
    git checkout -- .
```

## O que fazer quando abre o editor VIM

```bash
# habilitar modo edição
i
```

```bash
# Sair do VIM, salvando as alterações
<ESC>
:wq
<ENTER>
```

```bash
# Sair do VIM, descartando as alterações
<ESC>
:q!
<ENTER>
```

## Como desfazer o último commit sem desfazer as alterações nos arquivos

```bash
git reset --soft HEAD~1 
```

## Como deletar commits e também modificações nos arquivos

```bash
# Atenção
# Ação destrutiva - não tem como recuperar após comando efetuado

#deletar commit e alterações posteriores a esse commit
git reset --hard <código do commit>

#voltar o projeto ao estado do último commit
git reset --hard HEAD~1
```

