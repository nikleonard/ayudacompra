import "react-native-gesture-handler";
import React, { useState, useEffect } from "react";
import { View, Text, StyleSheet, Image, ScrollView } from "react-native";
import { Card, Button } from "react-native-elements";
import Axios from "axios";
import { human } from "react-native-typography";

const RequestDetailScreen = ({ route,navigation }) => {
  const {requestId,name,avatar,address} = route.params;
  let loaded = false;
  const [products,setProducts] = useState([]);

  useEffect(() => {
    const getProductsFromAPI = async() => {
      const result = await Axios('http://192.168.1.89:9000/api/v1/helprequest/' + requestId + '/items',);
        if(!loaded){
          setProducts(result.data);
          loaded = true;
        }
      };
      getProductsFromAPI();
  },[loaded]);
  
  return (
    <ScrollView>
      <View style={styles.container}>
        <Card style={styles.card}>
          <View style={styles.cardContainer}>
            <Image
              style={styles.stretch}
              source={{
                uri:
                  avatar,
              }}
            />
            <View style={styles.textContainer}>
            <Text style={human.headline}>{name}</Text>
            <Text style={human.callout}>{address}</Text>
            </View>
          </View>
        </Card>
      </View>

      <Card>
        {products.map((product, i) => {
          return (
            <View
              key={i}
              style={{
                flex: 1,
                flexDirection: "row",
                justifyContent: "space-between",
                flexWrap: "wrap",
                margin: 8,
              }}
            >
              <Text style={human.body}>{product.name}</Text>
            </View>
          );
        })}
        <Button
          large
          rightIcon={{ name: "CheckListScreen" }}
          title="Aceptar solicitud"
          buttonStyle={{
            backgroundColor: "#27AE60",
            width: "100%",
          }}
          onPress={() => navigation.navigate("CheckListScreen")}
        />
      </Card>
    </ScrollView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  card: {
    backgroundColor: "#fff",
    justifyContent: "space-between",
  },
  cardContainer: {
    flexDirection: "row",
    margin: 5,
    justifyContent: "flex-start",
  },
  cardTextContainer: {
    flex: 1,
    flexDirection: "row",
  },
  textContainer: {
    justifyContent: "center",
    marginLeft: "5%",
  },
  stretch: {
    width: 50,
    height: 50,
    resizeMode: "cover",
    borderRadius: 400 / 2,
  },
});

export default RequestDetailScreen;
