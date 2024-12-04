# GitHub Actions Overview

GitHub Actions es una plataforma de automatización de flujos de trabajo
 que te permite automatizar tareas dentro de tu repositorio de GitHub.
  Puedes crear flujos de trabajo que construyan, prueben y desplieguen
   tu código, entre otras muchas cosas, directamente desde tu repositorio.

## ¿Qué son los Flujos de Trabajo?

Un flujo de trabajo (workflow) en GitHub Actions es un
conjunto de reglas y pasos definidos dentro de un archivo
 YAML que se ejecutan en respuesta a eventos específicos
  en tu repositorio, como push, pull request, o cron jobs.
   Los flujos de trabajo se definen en el directorio
    `.github/workflows/` de tu repositorio.

## ¿Cómo Funciona GitHub Actions?

1. **Eventos**: Un flujo de trabajo se activa por
un evento, como un `push`, `pull_request`,
o un evento programado como un cron job.
2. **Trabajos**: Un flujo de trabajo
 se compone de uno o más trabajos (`jobs`).
  Cada trabajo se ejecuta de manera independiente
   y puede tener dependencias entre ellos.
3. **Pasos**: Dentro de cada trabajo, puedes definir
varios pasos (`steps`). Cada paso puede ejecutar comandos o usar acciones predefinidas.

## Ejemplo de un Workflow Básico

El siguiente ejemplo muestra un flujo de trabajo básico que
se ejecuta cuando se realiza un `push` a la rama `main`:

```yaml
name: CI Workflow

on:
  push:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout repository
        uses: actions/checkout@v3

      - name: Set up Node.js
        uses: actions/setup-node@v3
        with:
          node-version: '16'

      - name: Install dependencies
        run: npm install

      - name: Run tests
        run: npm test
