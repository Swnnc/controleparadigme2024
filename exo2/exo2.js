const char = '123456789'

const maskify (char) =>{

	char = '123456789';

	chardel = char.slice(-4);

	console.log("#".repeat(5) + chardel);
	return ;
}

console.log(maskify);
