<%@ page import="grails.envers.audit.Item" %>



<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'ISBN', 'error')} ">
    <label for="ISBN">
        <g:message code="item.ISBN.label" default="ISBN"/>

    </label>
    <g:textField name="ISBN" value="${itemInstance?.ISBN}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'author', 'error')} ">
    <label for="author">
        <g:message code="item.author.label" default="Author"/>

    </label>
    <g:textField name="author" value="${itemInstance?.author}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: itemInstance, field: 'title', 'error')} ">
    <label for="title">
        <g:message code="item.title.label" default="Title"/>

    </label>
    <g:textField name="title" value="${itemInstance?.title}"/>
</div>

