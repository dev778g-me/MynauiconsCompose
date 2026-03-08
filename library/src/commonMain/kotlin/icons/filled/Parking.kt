package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Parking: ImageVector
    get() {
        if (_Parking != null) {
            return _Parking!!
        }
        _Parking = ImageVector.Builder(
            name = "Filled.Parking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.776f, 11.85f)
                horizontalLineTo(11.25f)
                verticalLineToRelative(-2.1f)
                horizontalLineToRelative(1.526f)
                curveToRelative(0.36f, 0f, 0.58f, 0.132f, 0.722f, 0.299f)
                curveToRelative(0.155f, 0.182f, 0.252f, 0.452f, 0.252f, 0.751f)
                reflectiveCurveToRelative(-0.097f, 0.569f, -0.252f, 0.751f)
                curveToRelative(-0.142f, 0.167f, -0.363f, 0.299f, -0.722f, 0.299f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveToRelative(8.25f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.65f)
                horizontalLineToRelative(1.526f)
                curveToRelative(0.79f, 0f, 1.431f, -0.318f, 1.864f, -0.826f)
                curveToRelative(0.42f, -0.493f, 0.61f, -1.123f, 0.61f, -1.724f)
                reflectiveCurveToRelative(-0.19f, -1.231f, -0.61f, -1.724f)
                curveToRelative(-0.433f, -0.508f, -1.075f, -0.826f, -1.864f, -0.826f)
                close()
            }
        }.build()

        return _Parking!!
    }

@Suppress("ObjectPropertyName")
private var _Parking: ImageVector? = null
