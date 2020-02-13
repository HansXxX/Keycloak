<#import "/spring.ftl" as spring>
<html>
<h1>My products</h1>
<ul>
<#list products as product>
    <li>${product}</li>
</#list>
</ul>
<p>
    <a href="/logout">Logout</a>
</p>
</html>

<!-- Pagina che mostra tutti i prodotti in possesso dell'utente autenticato.
Ha un link che se cliccato effettua il logout dell'utente, reindirizzando sulla landing page iniziale.
Questa pagina ha visibilità della lista in quanto è stata settata nel Model dal controller in risposta
ad una get sull'url /products -->