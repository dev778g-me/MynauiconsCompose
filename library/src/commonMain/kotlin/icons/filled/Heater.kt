package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Heater: ImageVector
    get() {
        if (_Heater != null) {
            return _Heater!!
        }
        _Heater = ImageVector.Builder(
            name = "Filled.Heater",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 9f)
                curveToRelative(0f, -0.581f, 0.19f, -1.14f, 0.398f, -1.61f)
                curveToRelative(0.212f, -0.476f, 0.49f, -0.959f, 0.734f, -1.386f)
                curveToRelative(0.256f, -0.448f, 0.478f, -0.84f, 0.641f, -1.207f)
                curveTo(6.94f, 4.423f, 7f, 4.169f, 7f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                curveToRelative(0f, 0.581f, -0.19f, 1.14f, -0.398f, 1.61f)
                curveToRelative(-0.212f, 0.476f, -0.49f, 0.959f, -0.734f, 1.386f)
                curveToRelative(-0.256f, 0.448f, -0.478f, 0.84f, -0.641f, 1.207f)
                curveTo(7.06f, 8.577f, 7f, 8.831f, 7f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                moveToRelative(5f, 0f)
                curveToRelative(0f, -0.581f, 0.19f, -1.14f, 0.398f, -1.61f)
                curveToRelative(0.212f, -0.476f, 0.49f, -0.959f, 0.734f, -1.386f)
                curveToRelative(0.256f, -0.448f, 0.478f, -0.84f, 0.641f, -1.207f)
                curveTo(11.94f, 4.423f, 12f, 4.169f, 12f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                curveToRelative(0f, 0.581f, -0.19f, 1.14f, -0.398f, 1.61f)
                curveToRelative(-0.212f, 0.476f, -0.49f, 0.959f, -0.734f, 1.386f)
                curveToRelative(-0.256f, 0.448f, -0.478f, 0.84f, -0.641f, 1.207f)
                curveTo(12.06f, 8.577f, 12f, 8.831f, 12f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                moveToRelative(5f, 0f)
                curveToRelative(0f, -0.581f, 0.19f, -1.14f, 0.398f, -1.61f)
                curveToRelative(0.212f, -0.476f, 0.49f, -0.959f, 0.734f, -1.386f)
                curveToRelative(0.256f, -0.448f, 0.478f, -0.84f, 0.641f, -1.207f)
                curveTo(16.94f, 4.423f, 17f, 4.169f, 17f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                curveToRelative(0f, 0.581f, -0.19f, 1.14f, -0.398f, 1.61f)
                curveToRelative(-0.212f, 0.476f, -0.49f, 0.959f, -0.734f, 1.386f)
                curveToRelative(-0.256f, 0.448f, -0.478f, 0.84f, -0.641f, 1.207f)
                curveTo(17.06f, 8.577f, 17f, 8.831f, 17f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                moveToRelative(5.5f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-13f)
                verticalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-7.4f)
                curveToRelative(0f, -0.628f, 0.085f, -1.38f, 0.617f, -1.931f)
                curveToRelative(0.54f, -0.56f, 1.3f, -0.669f, 1.983f, -0.669f)
                horizontalLineToRelative(11.8f)
                curveToRelative(0.683f, 0f, 1.442f, 0.109f, 1.983f, 0.669f)
                curveToRelative(0.532f, 0.552f, 0.617f, 1.303f, 0.617f, 1.93f)
                close()
            }
        }.build()

        return _Heater!!
    }

@Suppress("ObjectPropertyName")
private var _Heater: ImageVector? = null
