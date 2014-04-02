from django.test import TestCase

# Create your tests here.

from django.http import HttpResponse 
from django.shortcuts import render,redirect,render_to_response
from django.conf.urls import patterns, url, include


def index(request):
    #return HttpResponse("Hello, world.")
    #return redirect('/proj1/1.html')
    #return HttpResponseRedirect("/1.html")
    #return render_to_response('1.html')

    #return render(request, "1.html")

    from django.template import Template
    p = request.GET['p']
    
    t = Template("My name is {{ my_name }}.")
    return HttpResponse(p)
