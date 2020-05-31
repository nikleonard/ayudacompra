import "react-native-gesture-handler";
import React, { useState, useEffect } from "react";
import {
  StyleSheet,
  Text,
  View,
  Image,
  TouchableOpacity,
  ScrollView,
} from "react-native";
import { Card } from "react-native-elements";
import Axios from "axios";
import { human } from "react-native-typography";

const RequestDashboardScreen = ({ navigation }) => {
  const [requests,setRequests] = useState([]);
  
  let loaded = false;
  useEffect(() => {
    const getRequestsFromAPI = async() => {
      const result = await Axios('http://192.168.1.89:9000/api/v1/helprequest/',);
        if(!loaded){
          setRequests(result.data);
          loaded = true;
        }
      };
      getRequestsFromAPI();
    },[loaded]);

  return (
    <ScrollView>
      <View style={styles.container}>
        {requests.map((request, i) => {
          return (
            <TouchableOpacity
              key={request.id}
              onPress={() => navigation.navigate("RequestDetailScreen", {
                requestId : request.id,
                name : request.name,
                avatar : request.avatar,
                address : request.address
              })}
            >
              <Card style={styles.card}>
                <View style={styles.cardContainer}>
                  <Image style={styles.stretch} source={{ uri: request.avatar }} />
                  <View style={styles.textContainer}>
                    <Text style={human.headline}>{request.name}</Text>
                    <Text style={human.callout}>{request.direccion}</Text>
                  </View>
                </View>
              </Card>
            </TouchableOpacity>
          );
        })}
      </View>
    </ScrollView>
  );
};

const styles = StyleSheet.create({
  card: {
    backgroundColor: "#fff",
    justifyContent: "space-between",
  },
  cardContainer: {
    flexDirection: "row",
    margin: 5,
    justifyContent: "flex-start",
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

export default RequestDashboardScreen;
