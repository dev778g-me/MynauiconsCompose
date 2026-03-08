package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Cannabis: ImageVector
    get() {
        if (_Cannabis != null) {
            return _Cannabis!!
        }
        _Cannabis = ImageVector.Builder(
            name = "Outline.Cannabis",
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
                moveTo(12f, 16.5f)
                verticalLineToRelative(5f)
                moveToRelative(0f, -5f)
                lineToRelative(-3.199f, 0.96f)
                curveToRelative(-1.726f, 0.518f, -2.977f, -0.44f, -4.214f, -1.47f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.097f, -0.832f)
                lineToRelative(3.068f, -1.534f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.052f, -0.32f)
                lineTo(4.498f, 9.998f)
                curveToRelative(-0.373f, -0.373f, 0.01f, -0.995f, 0.511f, -0.828f)
                lineToRelative(5.271f, 1.757f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.26f, -0.155f)
                lineTo(12f, 2.5f)
                lineToRelative(1.46f, 8.272f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.26f, 0.155f)
                lineToRelative(5.27f, -1.757f)
                curveToRelative(0.501f, -0.167f, 0.885f, 0.455f, 0.512f, 0.828f)
                lineToRelative(-3.306f, 3.306f)
                arcToRelative(0.2f, 0.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.052f, 0.32f)
                lineToRelative(3.068f, 1.534f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.097f, 0.831f)
                curveToRelative(-1.237f, 1.031f, -2.488f, 1.989f, -4.215f, 1.47f)
                close()
            }
        }.build()

        return _Cannabis!!
    }

@Suppress("ObjectPropertyName")
private var _Cannabis: ImageVector? = null
