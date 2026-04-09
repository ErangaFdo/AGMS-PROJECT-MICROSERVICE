package lk.ijse.gdse.zonemanagementservice.service;

import lk.ijse.gdse.zonemanagementservice.dto.ZoneDto;

import java.util.List;
import java.util.Optional;

public interface ZoneService {

    ZoneDto createZone(ZoneDto zoneDto);

    Optional<ZoneDto> getZoneById(Long id);

    List<ZoneDto> getAllZones();

    List<ZoneDto> getZonesByUserId(Long userId);

    ZoneDto updateZone(Long id, ZoneDto zoneDto);

    void deleteZone(Long id);

    Optional<ZoneDto> getZoneByName(String name);

    Optional<ZoneDto> getZoneByDeviceId(String deviceId);

    boolean validateZoneThresholds(ZoneDto zoneDto);
}
