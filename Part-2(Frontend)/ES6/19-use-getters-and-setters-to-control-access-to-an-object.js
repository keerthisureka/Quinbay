// Only change code below this line
class Thermostat {
  constructor(temp) { // Stores the fahrenheit temperature
    this._fahrenheit = temp;
  }
  get temperature() { // Returns the temperature in celsius
    return (5 / 9) * (this._fahrenheit - 32);
  }
  set temperature(temp) { // Converts the temperature from celsius to fahrenheit
    this._fahrenheit = temp * (9.0 / 5) + 32;
  }
}
// Only change code above this line

const thermos = new Thermostat(76); // Setting in Fahrenheit scale
let temp = thermos.temperature; // 24.44 in Celsius
thermos.temperature = 26;
temp = thermos.temperature; // 26 in Celsius