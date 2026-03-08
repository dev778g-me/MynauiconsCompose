package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Code: ImageVector
    get() {
        if (_Code != null) {
            return _Code!!
        }
        _Code = ImageVector.Builder(
            name = "Filled.Code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.56f, 7.444f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
                lineToRelative(0.23f, 0.23f)
                lineToRelative(0.038f, 0.038f)
                curveToRelative(0.862f, 0.862f, 1.563f, 1.563f, 2.04f, 2.19f)
                curveToRelative(0.5f, 0.652f, 0.826f, 1.312f, 0.826f, 2.098f)
                reflectiveCurveToRelative(-0.327f, 1.446f, -0.825f, 2.099f)
                curveToRelative(-0.478f, 0.626f, -1.179f, 1.327f, -2.04f, 2.189f)
                lineToRelative(-0.27f, 0.268f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(0.23f, -0.23f)
                curveToRelative(0.91f, -0.91f, 1.538f, -1.54f, 1.947f, -2.077f)
                curveToRelative(0.397f, -0.52f, 0.518f, -0.863f, 0.518f, -1.19f)
                curveToRelative(0f, -0.325f, -0.121f, -0.668f, -0.518f, -1.188f)
                curveToRelative(-0.41f, -0.537f, -1.037f, -1.167f, -1.947f, -2.077f)
                lineToRelative(-0.23f, -0.23f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                moveTo(14.07f, 4.276f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.53f, 0.918f)
                lineToRelative(-3.75f, 14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.45f, -0.388f)
                lineToRelative(3.752f, -14f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.918f, -0.53f)
                moveTo(7.441f, 7.444f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                lineToRelative(-0.23f, 0.23f)
                curveToRelative(-0.91f, 0.91f, -1.537f, 1.54f, -1.947f, 2.077f)
                curveToRelative(-0.397f, 0.52f, -0.517f, 0.863f, -0.517f, 1.189f)
                reflectiveCurveToRelative(0.12f, 0.67f, 0.517f, 1.189f)
                curveToRelative(0.41f, 0.537f, 1.037f, 1.167f, 1.947f, 2.076f)
                lineToRelative(0.23f, 0.23f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, 1.061f)
                lineToRelative(-0.269f, -0.268f)
                curveToRelative(-0.862f, -0.862f, -1.563f, -1.563f, -2.04f, -2.19f)
                curveToRelative(-0.499f, -0.652f, -0.825f, -1.312f, -0.825f, -2.098f)
                reflectiveCurveToRelative(0.326f, -1.446f, 0.824f, -2.099f)
                curveToRelative(0.478f, -0.626f, 1.179f, -1.327f, 2.041f, -2.189f)
                lineToRelative(0.269f, -0.268f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
            }
        }.build()

        return _Code!!
    }

@Suppress("ObjectPropertyName")
private var _Code: ImageVector? = null
