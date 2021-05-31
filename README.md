# API Spec

## 1.Create Product

 Request :
 - Method : POST
 - Endpoint : `/api/products`
 - Header :
   - Content-Type : Application/json
   - Accept : Application/json
 - Body :

 ```Json
 {
  "id" : "String, unique",
  "name" : "String",
  "price" : "Long",
  "quantity" : "Interger"
 }
 ```

Response :
```json
{
  "code": "number",
  "status": "string",
  "data": {
    "id": "String, unique",
    "name": "String",
    "price": "Long",
    "quantity": "Interger",
    "createdAt": "Date",
    "updateAt": "Date"
  }
}
```

## 2.Get Product

Request :
- Method : GET
- Endpoint : `/api/product/{id_product}`
- Header :
    - Accept : Application/json
    
Response :

```json
{
  "code": "number",
  "status": "string",
  "data": {
    "id": "String, unique",
    "name": "String",
    "price": "Long",
    "quantity": "Interger",
    "createdAt": "Date",
    "updateAt": "Date"
  }
}
```

## 3.Update Product


Request :
- Method : PUT
- Endpoint : `/api/product/{id_product}`
- Header :
    - Content-Type : Application/json
    - Accept : Application/json
- Body :

 ```Json
 {
  "name" : "String",
  "price" : "Long",
  "quantity" : "Interger",
  "UpdateAt" : "Date"
 }
 ```

Response :
```json
{
  "code": "number",
  "status": "string",
  "data": {
    "id": "String, unique",
    "name": "String",
    "price": "Long",
    "quantity": "Interger",
    "createdAt": "Date",
    "updateAt": "Date"
  }
}
```

## 4.List Product

Request :
- Method : GET
- Endpoint : `/api/products`
- Header :
    - Accept : Application/json
- Query Param :
    - Size : number
    - page : number

Response :

```Json
{
    "code" : "number",
    "status" : "string"
    "data": [
        {    
                "id" : "String, unique",
                "name" : "String",
                "price" : "Long",
                "quantity" : "Interger",
                "createdAt" : "Date",
                "updateAt" : "Date"
        },
      {
                "id" : "String, unique",
                "name" : "String",
                "price" : "Long",
                "quantity" : "Interger",
                "createdAt" : "Date",
                "updateAt" : "Date"
      }
            ]
}
 ```

## 5.Delete Product


Request :
- Method : DELETE
- Endpoint : `/api/product/{id_product}`
- Header :
    - Accept : Application/json
    
Response :

```Json
    "code" : "number",
    "status" : "string"

 ```