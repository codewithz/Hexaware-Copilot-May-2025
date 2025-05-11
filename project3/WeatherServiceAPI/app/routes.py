from flask import Blueprint, jsonify, request
from app.services.weather_service import get_weather_data

weather_bp = Blueprint('weather', __name__)

@weather_bp.route('/weather', methods=['GET'])
def weather():
    city = request.args.get('city')
    if not city:
        return jsonify({"error": "City parameter is required"}), 400

    weather_data = get_weather_data(city)
    if weather_data is None:
        return jsonify({"error": "Weather data not found"}), 404

    return jsonify(weather_data), 200