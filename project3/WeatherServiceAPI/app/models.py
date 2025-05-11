from flask_sqlalchemy import SQLAlchemy

db = SQLAlchemy()

class WeatherData(db.Model):
    __tablename__ = 'weather_data'

    id = db.Column(db.Integer, primary_key=True)
    temperature = db.Column(db.Float, nullable=False)
    humidity = db.Column(db.Float, nullable=False)
    description = db.Column(db.String(255), nullable=False)
    timestamp = db.Column(db.DateTime, nullable=False)

    def __repr__(self):
        return f'<WeatherData {self.id}: {self.temperature}°C, {self.humidity}%, {self.description}>'