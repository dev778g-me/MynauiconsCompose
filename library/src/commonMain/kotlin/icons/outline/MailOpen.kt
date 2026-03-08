package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MailOpen: ImageVector
    get() {
        if (_MailOpen != null) {
            return _MailOpen!!
        }
        _MailOpen = ImageVector.Builder(
            name = "Outline.MailOpen",
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
                moveTo(2.36f, 7.708f)
                verticalLineToRelative(6.989f)
                curveToRelative(0f, 1.68f, 0f, 2.52f, 0.327f, 3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.311f, 1.31f)
                curveToRelative(0.642f, 0.328f, 1.482f, 0.328f, 3.162f, 0.328f)
                horizontalLineToRelative(9.68f)
                curveToRelative(1.68f, 0f, 2.52f, 0f, 3.162f, -0.327f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.311f, -1.311f)
                curveToRelative(0.327f, -0.642f, 0.327f, -1.482f, 0.327f, -3.162f)
                verticalLineTo(7.708f)
                moveToRelative(-19.28f, 0f)
                lineToRelative(7.308f, -4.062f)
                curveToRelative(0.851f, -0.473f, 1.277f, -0.71f, 1.727f, -0.802f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.21f, 0f)
                curveToRelative(0.45f, 0.093f, 0.876f, 0.33f, 1.727f, 0.802f)
                lineToRelative(7.308f, 4.062f)
                moveToRelative(-19.28f, 0f)
                lineToRelative(6.978f, 4.655f)
                curveToRelative(0.962f, 0.641f, 1.442f, 0.962f, 1.963f, 1.087f)
                curveToRelative(0.46f, 0.11f, 0.939f, 0.11f, 1.398f, 0f)
                curveToRelative(0.52f, -0.125f, 1.002f, -0.446f, 1.965f, -1.088f)
                lineToRelative(6.976f, -4.654f)
            }
        }.build()

        return _MailOpen!!
    }

@Suppress("ObjectPropertyName")
private var _MailOpen: ImageVector? = null
