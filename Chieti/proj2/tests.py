from django.test import TestCase
from django.http import request, HttpResponse
# Create your tests here.
def index(request):
    p = request.GET.get('p')
    if p is not None:
        return HttpResponse(p)
    else:
        return HttpResponse("No hay p ")

