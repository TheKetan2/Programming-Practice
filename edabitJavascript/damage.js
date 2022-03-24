function damage(damage, speed, time) {
	
	let value={
		"second":1,
		"minute":60,
		"hour":3600,
	};
	return damage<0||speed<0?"invalid": damage*speed*value[time];
}
