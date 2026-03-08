package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Percentage: ImageVector
    get() {
        if (_Percentage != null) {
            return _Percentage!!
        }
        _Percentage = ImageVector.Builder(
            name = "Filled.Percentage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.058f, 4.206f)
                curveToRelative(0.61f, -0.707f, 1.486f, -0.956f, 2.442f, -0.956f)
                reflectiveCurveToRelative(1.831f, 0.249f, 2.442f, 0.956f)
                curveToRelative(0.59f, 0.682f, 0.808f, 1.65f, 0.808f, 2.794f)
                reflectiveCurveToRelative(-0.218f, 2.112f, -0.808f, 2.794f)
                curveToRelative(-0.61f, 0.707f, -1.486f, 0.956f, -2.442f, 0.956f)
                reflectiveCurveToRelative(-1.831f, -0.249f, -2.442f, -0.956f)
                curveTo(3.468f, 9.112f, 3.25f, 8.144f, 3.25f, 7f)
                reflectiveCurveToRelative(0.218f, -2.112f, 0.808f, -2.794f)
                moveToRelative(15.472f, 0.264f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                lineToRelative(-14f, 14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(14f, -14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                moveToRelative(-4.473f, 9.736f)
                curveToRelative(0.612f, -0.707f, 1.487f, -0.956f, 2.443f, -0.956f)
                reflectiveCurveToRelative(1.831f, 0.249f, 2.442f, 0.956f)
                curveToRelative(0.59f, 0.682f, 0.808f, 1.65f, 0.808f, 2.794f)
                reflectiveCurveToRelative(-0.218f, 2.112f, -0.808f, 2.794f)
                curveToRelative(-0.61f, 0.707f, -1.486f, 0.956f, -2.442f, 0.956f)
                reflectiveCurveToRelative(-1.831f, -0.249f, -2.443f, -0.956f)
                curveToRelative(-0.589f, -0.682f, -0.807f, -1.65f, -0.807f, -2.794f)
                reflectiveCurveToRelative(0.218f, -2.112f, 0.807f, -2.794f)
            }
        }.build()

        return _Percentage!!
    }

@Suppress("ObjectPropertyName")
private var _Percentage: ImageVector? = null
