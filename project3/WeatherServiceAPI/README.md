# WeatherService API

This project is a Flask-based API for providing weather data. It serves as a WeatherService that allows users to access weather information through defined endpoints.

## Project Structure

```
WeatherServiceAPI
├── app
│   ├── __init__.py
│   ├── routes.py
│   ├── models.py
│   └── services
│       └── weather_service.py
├── tests
│   ├── __init__.py
│   └── test_routes.py
├── requirements.txt
├── config.py
├── run.py
└── README.md
```

## Installation

1. Clone the repository:
   ```
   git clone <repository-url>
   cd WeatherServiceAPI
   ```

2. Create a virtual environment:
   ```
   python -m venv venv
   ```

3. Activate the virtual environment:
   - On Windows:
     ```
     venv\Scripts\activate
     ```
   - On macOS/Linux:
     ```
     source venv/bin/activate
     ```

4. Install the required packages:
   ```
   pip install -r requirements.txt
   ```

## Configuration

Before running the application, ensure that you have configured the necessary environment variables and API keys in `config.py`.

## Running the Application

To start the Flask application, run:
```
python run.py
```

The API will be available at `http://localhost:5000`.

## API Endpoints

- `/weather`: Get current weather data.
- `/weather/<city>`: Get weather data for a specific city.

## Testing

To run the tests, ensure your virtual environment is activated and run:
```
pytest
```

## Contributing

Feel free to submit issues or pull requests for improvements or bug fixes.

## License

This project is licensed under the MIT License.