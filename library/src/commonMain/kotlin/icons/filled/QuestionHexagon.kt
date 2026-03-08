package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.QuestionHexagon: ImageVector
    get() {
        if (_QuestionHexagon != null) {
            return _QuestionHexagon!!
        }
        _QuestionHexagon = ImageVector.Builder(
            name = "Filled.QuestionHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.75f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, 0.355f)
                lineToRelative(-6.61f, 3.8f)
                lineToRelative(-0.002f, 0.002f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, 8.198f)
                verticalLineToRelative(7.603f)
                arcToRelative(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.318f, 2.292f)
                lineToRelative(0.003f, 0.002f)
                lineToRelative(6.608f, 3.799f)
                horizontalLineToRelative(0.002f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.639f, 0f)
                horizontalLineToRelative(0.001f)
                lineToRelative(6.608f, -3.8f)
                horizontalLineToRelative(0.003f)
                arcTo(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.25f, 15.8f)
                verticalLineTo(8.2f)
                arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.318f, -2.292f)
                lineToRelative(-6.61f, -3.8f)
                lineToRelative(-0.002f, -0.002f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.75f)
                moveToRelative(0f, 12.997f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(1.872f, -6.814f)
                curveToRelative(0.544f, 0.482f, 0.878f, 1.188f, 0.878f, 2.057f)
                curveToRelative(0f, 0.64f, -0.164f, 1.138f, -0.45f, 1.543f)
                curveToRelative(-0.256f, 0.365f, -0.588f, 0.614f, -0.823f, 0.79f)
                lineToRelative(-0.027f, 0.02f)
                curveToRelative(-0.263f, 0.198f, -0.416f, 0.32f, -0.524f, 0.474f)
                curveToRelative(-0.09f, 0.127f, -0.176f, 0.317f, -0.176f, 0.68f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -0.64f, 0.164f, -1.14f, 0.45f, -1.544f)
                curveToRelative(0.256f, -0.364f, 0.588f, -0.613f, 0.823f, -0.79f)
                lineToRelative(0.027f, -0.02f)
                curveToRelative(0.263f, -0.198f, 0.416f, -0.32f, 0.524f, -0.474f)
                curveToRelative(0.09f, -0.127f, 0.176f, -0.317f, 0.176f, -0.679f)
                curveToRelative(0f, -0.46f, -0.166f, -0.75f, -0.372f, -0.934f)
                arcToRelative(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.878f, -0.31f)
                curveToRelative(-0.34f, 0f, -0.657f, 0.114f, -0.877f, 0.31f)
                curveToRelative(-0.207f, 0.183f, -0.373f, 0.474f, -0.373f, 0.934f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -0.869f, 0.334f, -1.575f, 0.877f, -2.057f)
                arcTo(2.83f, 2.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7.246f)
                curveToRelative(0.66f, 0f, 1.343f, 0.218f, 1.872f, 0.687f)
            }
        }.build()

        return _QuestionHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _QuestionHexagon: ImageVector? = null
