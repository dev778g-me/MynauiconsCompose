package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Ambulance: ImageVector
    get() {
        if (_Ambulance != null) {
            return _Ambulance!!
        }
        _Ambulance = ImageVector.Builder(
            name = "Outline.Ambulance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.9f, 10f)
                horizontalLineToRelative(4f)
                moveToRelative(-2f, -2f)
                verticalLineToRelative(4f)
                moveToRelative(0.307f, 4.455f)
                curveTo(9.207f, 17.86f, 8.095f, 19f, 6.724f, 19f)
                reflectiveCurveToRelative(-2.483f, -1.14f, -2.483f, -2.546f)
                moveToRelative(4.966f, 0f)
                curveToRelative(0f, -1.405f, -1.112f, -2.545f, -2.483f, -2.545f)
                reflectiveCurveToRelative(-2.483f, 1.14f, -2.483f, 2.545f)
                moveToRelative(4.966f, 0f)
                horizontalLineToRelative(5.586f)
                moveToRelative(-10.552f, 0f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(9.793f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(2.182f)
                moveToRelative(5.586f, 8.272f)
                curveToRelative(0f, 1.406f, -1.111f, 2.546f, -2.482f, 2.546f)
                reflectiveCurveToRelative(-2.483f, -1.14f, -2.483f, -2.546f)
                moveToRelative(4.965f, 0f)
                curveToRelative(0f, -1.405f, -1.111f, -2.545f, -2.482f, -2.545f)
                reflectiveCurveToRelative(-2.483f, 1.14f, -2.483f, 2.545f)
                moveToRelative(4.965f, 0f)
                horizontalLineTo(21f)
                verticalLineToRelative(-5.09f)
                lineToRelative(-2.515f, -2.579f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.431f, -0.603f)
                horizontalLineToRelative(-2.26f)
                moveToRelative(0.62f, 8.272f)
                horizontalLineToRelative(-0.62f)
                moveToRelative(0f, 0f)
                verticalLineTo(8.182f)
            }
        }.build()

        return _Ambulance!!
    }

@Suppress("ObjectPropertyName")
private var _Ambulance: ImageVector? = null
