package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Database: ImageVector
    get() {
        if (_Database != null) {
            return _Database!!
        }
        _Database = ImageVector.Builder(
            name = "Filled.Database",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.09f, 3.138f)
                curveTo(7.637f, 2.58f, 9.727f, 2.25f, 12f, 2.25f)
                reflectiveCurveToRelative(4.362f, 0.33f, 5.91f, 0.888f)
                curveToRelative(0.772f, 0.277f, 1.449f, 0.626f, 1.947f, 1.05f)
                curveToRelative(0.496f, 0.421f, 0.893f, 0.99f, 0.893f, 1.692f)
                lineToRelative(-0.001f, 0.077f)
                lineToRelative(0.001f, 0.043f)
                verticalLineToRelative(12.165f)
                curveToRelative(0f, 0.772f, -0.418f, 1.38f, -0.965f, 1.823f)
                curveToRelative(-0.54f, 0.438f, -1.265f, 0.768f, -2.06f, 1.019f)
                curveToRelative(-1.597f, 0.503f, -3.679f, 0.743f, -5.725f, 0.743f)
                reflectiveCurveToRelative(-4.128f, -0.24f, -5.725f, -0.743f)
                curveToRelative(-0.795f, -0.25f, -1.52f, -0.581f, -2.06f, -1.019f)
                curveToRelative(-0.547f, -0.443f, -0.965f, -1.051f, -0.965f, -1.823f)
                verticalLineTo(6f)
                lineToRelative(0.001f, -0.043f)
                lineToRelative(-0.001f, -0.077f)
                curveToRelative(0f, -0.702f, 0.397f, -1.27f, 0.893f, -1.692f)
                curveToRelative(0.498f, -0.424f, 1.175f, -0.773f, 1.946f, -1.05f)
                moveTo(4.75f, 8.226f)
                verticalLineToRelative(3.524f)
                curveToRelative(0f, 0.664f, 0.574f, 1.363f, 2.022f, 1.926f)
                curveToRelative(1.386f, 0.54f, 3.287f, 0.824f, 5.228f, 0.824f)
                reflectiveCurveToRelative(3.842f, -0.285f, 5.228f, -0.824f)
                curveToRelative(1.448f, -0.563f, 2.022f, -1.262f, 2.022f, -1.926f)
                verticalLineTo(8.226f)
                arcToRelative(7.2f, 7.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.504f, 0.703f)
                curveToRelative(-1.605f, 0.556f, -3.694f, 0.821f, -5.746f, 0.821f)
                reflectiveCurveToRelative(-4.141f, -0.265f, -5.746f, -0.821f)
                arcToRelative(7.2f, 7.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.504f, -0.703f)
            }
        }.build()

        return _Database!!
    }

@Suppress("ObjectPropertyName")
private var _Database: ImageVector? = null
