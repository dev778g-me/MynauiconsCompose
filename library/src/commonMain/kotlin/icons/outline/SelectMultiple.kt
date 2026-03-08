package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.SelectMultiple: ImageVector
    get() {
        if (_SelectMultiple != null) {
            return _SelectMultiple!!
        }
        _SelectMultiple = ImageVector.Builder(
            name = "Outline.SelectMultiple",
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
                moveTo(3f, 9f)
                verticalLineToRelative(10.4f)
                curveToRelative(0f, 0.56f, 0f, 0.84f, 0.109f, 1.054f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.437f, 0.437f)
                curveTo(3.76f, 21f, 4.04f, 21f, 4.598f, 21f)
                horizontalLineTo(15f)
                moveToRelative(-8f, -7.2f)
                verticalLineTo(6.2f)
                curveToRelative(0f, -1.12f, 0f, -1.68f, 0.218f, -2.108f)
                curveToRelative(0.192f, -0.377f, 0.497f, -0.682f, 0.874f, -0.874f)
                curveTo(8.52f, 3f, 9.08f, 3f, 10.2f, 3f)
                horizontalLineToRelative(7.6f)
                curveToRelative(1.12f, 0f, 1.68f, 0f, 2.108f, 0.218f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.874f, 0.874f)
                curveTo(21f, 4.52f, 21f, 5.08f, 21f, 6.2f)
                verticalLineToRelative(7.6f)
                curveToRelative(0f, 1.12f, 0f, 1.68f, -0.218f, 2.108f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.874f, 0.874f)
                curveToRelative(-0.428f, 0.218f, -0.986f, 0.218f, -2.104f, 0.218f)
                horizontalLineToRelative(-7.607f)
                curveToRelative(-1.118f, 0f, -1.678f, 0f, -2.105f, -0.218f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.874f, -0.874f)
                curveTo(7f, 15.48f, 7f, 14.92f, 7f, 13.8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(11.6f, 10.323f)
                lineToRelative(1.379f, 1.575f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.466f, -0.022f)
                lineTo(16.245f, 8f)
            }
        }.build()

        return _SelectMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _SelectMultiple: ImageVector? = null
