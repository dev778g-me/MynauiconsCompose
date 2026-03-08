package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Store: ImageVector
    get() {
        if (_Store != null) {
            return _Store!!
        }
        _Store = ImageVector.Builder(
            name = "Outline.Store",
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
                moveTo(19.996f, 10.621f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(6.004f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.999f, -2f)
                verticalLineToRelative(-8.379f)
                moveTo(7.502f, 8.75f)
                lineToRelative(0.5f, -5.75f)
                moveToRelative(-0.5f, 5.75f)
                curveToRelative(0f, 2.902f, 4.498f, 2.902f, 4.498f, 0f)
                moveToRelative(-4.498f, 0f)
                curveToRelative(0f, 3.176f, -5.155f, 2.52f, -4.433f, -0.248f)
                lineToRelative(1.045f, -4.007f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.048f, 3f)
                horizontalLineToRelative(11.904f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.934f, 1.495f)
                lineToRelative(1.045f, 4.007f)
                curveToRelative(0.722f, 2.769f, -4.433f, 3.424f, -4.433f, 0.248f)
                moveTo(12f, 8.75f)
                verticalLineTo(3f)
                moveToRelative(0f, 5.75f)
                curveToRelative(0f, 2.902f, 4.498f, 2.902f, 4.498f, 0f)
                moveToRelative(0f, 0f)
                lineToRelative(-0.5f, -5.75f)
            }
        }.build()

        return _Store!!
    }

@Suppress("ObjectPropertyName")
private var _Store: ImageVector? = null
