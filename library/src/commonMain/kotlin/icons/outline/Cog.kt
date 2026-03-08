package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Cog: ImageVector
    get() {
        if (_Cog != null) {
            return _Cog!!
        }
        _Cog = ImageVector.Builder(
            name = "Outline.Cog",
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
                moveTo(10.11f, 3.9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.995f, -0.9f)
                horizontalLineToRelative(1.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.995f, 0.9f)
                lineToRelative(0.033f, 0.333f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.209f, 0.915f)
                lineToRelative(0.259f, -0.212f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.34f, 0.067f)
                lineToRelative(1.266f, 1.266f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.067f, 1.34f)
                lineToRelative(-0.212f, 0.26f)
                curveToRelative(0.409f, 0.676f, 0.72f, 1.419f, 0.915f, 2.208f)
                lineToRelative(0.332f, 0.033f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.901f, 0.995f)
                verticalLineToRelative(1.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 0.995f)
                lineToRelative(-0.333f, 0.033f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.915f, 2.209f)
                lineToRelative(0.212f, 0.259f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.067f, 1.34f)
                lineToRelative(-1.266f, 1.266f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, 0.067f)
                lineToRelative(-0.26f, -0.212f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.208f, 0.915f)
                lineToRelative(-0.033f, 0.332f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.995f, 0.901f)
                horizontalLineToRelative(-1.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.995f, -0.9f)
                lineToRelative(-0.033f, -0.333f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.209f, -0.915f)
                lineToRelative(-0.259f, 0.212f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, -0.067f)
                lineTo(5.003f, 17.73f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.067f, -1.34f)
                lineToRelative(0.212f, -0.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.915f, -2.208f)
                lineTo(3.9f, 13.89f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, -0.995f)
                verticalLineToRelative(-1.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.9f, -0.995f)
                lineToRelative(0.333f, -0.033f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.915f, -2.209f)
                lineToRelative(-0.212f, -0.259f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.067f, -1.34f)
                lineTo(6.27f, 5.003f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.34f, -0.067f)
                lineToRelative(0.26f, 0.212f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.208f, -0.915f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 12f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            }
        }.build()

        return _Cog!!
    }

@Suppress("ObjectPropertyName")
private var _Cog: ImageVector? = null
