package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.At: ImageVector
    get() {
        if (_At != null) {
            return _At!!
        }
        _At = ImageVector.Builder(
            name = "Filled.At",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.75f, 11.996f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3.75f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 8.246f)
                curveToRelative(0f, 2.3f, -1.1f, 3f, -1.75f, 3f)
                reflectiveCurveToRelative(-1.75f, -0.7f, -1.75f, -3f)
                verticalLineTo(7.998f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.538f)
                lineToRelative(-0.011f, -0.01f)
                curveTo(14.334f, 7.75f, 13.153f, 7.378f, 12f, 7.378f)
                reflectiveCurveToRelative(-2.334f, 0.37f, -3.239f, 1.148f)
                curveToRelative(-0.92f, 0.791f, -1.511f, 1.968f, -1.511f, 3.47f)
                curveToRelative(0f, 1.504f, 0.59f, 2.68f, 1.513f, 3.468f)
                curveToRelative(0.905f, 0.775f, 2.087f, 1.14f, 3.24f, 1.136f)
                curveToRelative(1.152f, -0.005f, 2.332f, -0.378f, 3.235f, -1.153f)
                quadToRelative(0.353f, -0.301f, 0.636f, -0.677f)
                curveToRelative(0.582f, 1.087f, 1.524f, 1.726f, 2.626f, 1.726f)
                curveToRelative(1.85f, 0f, 3.25f, -1.8f, 3.25f, -4.5f)
                curveToRelative(0f, -5.383f, -4.366f, -9.746f, -9.75f, -9.746f)
                reflectiveCurveToRelative(-9.75f, 4.363f, -9.75f, 9.746f)
                curveToRelative(0f, 5.376f, 4.356f, 9.735f, 9.731f, 9.745f)
                curveToRelative(1.83f, 0.087f, 4.263f, -0.46f, 6.251f, -1.986f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.913f, -1.19f)
                curveToRelative(-1.68f, 1.29f, -3.763f, 1.753f, -5.282f, 1.677f)
                horizontalLineTo(12f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.25f, -8.246f)
            }
        }.build()

        return _At!!
    }

@Suppress("ObjectPropertyName")
private var _At: ImageVector? = null
