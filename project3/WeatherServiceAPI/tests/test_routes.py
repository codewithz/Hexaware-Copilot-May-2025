from flask import json
from app import create_app

def test_get_weather(client):
    response = client.get('/api/weather?city=London')
    assert response.status_code == 200
    data = json.loads(response.data)
    assert 'temperature' in data
    assert 'description' in data

def test_get_weather_invalid_city(client):
    response = client.get('/api/weather?city=InvalidCity')
    assert response.status_code == 404
    data = json.loads(response.data)
    assert 'error' in data

def test_get_weather_no_city(client):
    response = client.get('/api/weather')
    assert response.status_code == 400
    data = json.loads(response.data)
    assert 'error' in data