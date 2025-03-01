var text = 'ex03 - js loop';

console.log('forIndex');
for (var i in text){
	console.log('i -->' + i);
}

console.log('forEach');
for (var element of text){
	console.log('element -->' + element);
}