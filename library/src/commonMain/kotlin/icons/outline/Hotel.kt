package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Hotel: ImageVector
    get() {
        if (_Hotel != null) {
            return _Hotel!!
        }
        _Hotel = ImageVector.Builder(
            name = "Outline.Hotel",
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
                moveTo(3f, 3f)
                horizontalLineToRelative(18f)
                moveTo(8.25f, 6f)
                verticalLineToRelative(0.5f)
                moveToRelative(2.5f, -0.5f)
                verticalLineToRelative(0.5f)
                moveToRelative(2.5f, -0.5f)
                verticalLineToRelative(0.5f)
                moveToRelative(2.5f, -0.5f)
                verticalLineToRelative(0.5f)
                moveToRelative(-7.5f, 2.75f)
                verticalLineToRelative(0.5f)
                moveToRelative(2.5f, -0.5f)
                verticalLineToRelative(0.5f)
                moveToRelative(2.5f, -0.5f)
                verticalLineToRelative(0.5f)
                moveToRelative(2.5f, -0.5f)
                verticalLineToRelative(0.5f)
                moveTo(17.5f, 21f)
                horizontalLineToRelative(-11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 19.5f)
                verticalLineTo(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(16.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
                moveToRelative(-2.06f, -6.742f)
                curveTo(14.707f, 13.37f, 13.358f, 12f, 12f, 12f)
                reflectiveCurveToRelative(-2.707f, 1.37f, -3.44f, 2.258f)
                curveToRelative(-0.253f, 0.308f, -0.027f, 0.742f, 0.371f, 0.742f)
                horizontalLineToRelative(6.138f)
                curveToRelative(0.398f, 0f, 0.624f, -0.434f, 0.37f, -0.742f)
                moveTo(10f, 15f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6f)
                close()
            }
        }.build()

        return _Hotel!!
    }

@Suppress("ObjectPropertyName")
private var _Hotel: ImageVector? = null
