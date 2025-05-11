import os

class Config:
    SECRET_KEY = os.environ.get('SECRET_KEY') or 'your_default_secret_key'
    DEBUG = os.environ.get('FLASK_DEBUG') or False
    WEATHER_API_KEY = os.environ.get('WEATHER_API_KEY') or 'your_weather_api_key'
    WEATHER_API_URL = 'https://api.weatherapi.com/v1'  # Example API URL
    # Add other configuration variables as needed