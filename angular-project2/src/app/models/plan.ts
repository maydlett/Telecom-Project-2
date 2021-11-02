export class Plan {
	planName : string;
	planPrice : number;
	planNumLines : number;
	customerId : number;
	
    constructor(   planName ="",  planPrice = 0.0,  planNumLines = 0,  customerId =0) {
		this.planName = planName;
		this.planPrice = planPrice;
		this.planNumLines = planNumLines;
		this.customerId = customerId;
	}



}