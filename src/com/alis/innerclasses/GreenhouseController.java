package com.alis.innerclasses;

import com.alis.innerclasses.controller.*;

public class GreenhouseController {
	public static void main(String[] args) {
		GreenhouseControls gc = new GreenhouseControls();
		// Вместо жесткого кодирования фиксированных данных
		// можно было бы считать информацию для настройки
		// из текстового файла:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = { gc.new ThermostatNight(0), gc.new LightOn(200), gc.new LightOff(400), gc.new WaterOn(600),
				gc.new WaterOff(800), gc.new VentOn(1400), gc.new ThermostatDay(1600), gc.new VentOff(1800) };
		gc.addEvent(gc.new Restart(3000, eventList));
//		if (args.length == 1)
//			gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
			gc.addEvent(new GreenhouseControls.Terminate(3000000));
		gc.run();
	}
}